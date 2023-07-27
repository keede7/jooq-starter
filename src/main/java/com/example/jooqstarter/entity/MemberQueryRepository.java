package com.example.jooqstarter.entity;

import nu.studer.sample.jooqdb.tables.MemberT;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberQueryRepository {

    private final DSLContext dsl;
    private final ApplicationEventPublisher applicationEventPublisher;

    public MemberQueryRepository(DSLContext dsl, ApplicationEventPublisher applicationEventPublisher) {
        this.dsl = dsl;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public List<Member> getList1() {
        return dsl.select(DSL.field("id"), DSL.field("name"))
                .from(DSL.table("member_t"))
                .fetchInto(Member.class);
    }

    public List<Member> getList2(String ss) {
        applicationEventPublisher.publishEvent(ss);
        return dsl.selectFrom(MemberT.MEMBER_T)
                .fetchInto(Member.class);
    }

    @EventListener
    public void eventTest(String test) {
        System.out.println("test = " + test);

    }

}
