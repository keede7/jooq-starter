package com.example.jooqstarter.entity;

import nu.studer.sample.jooqdb.tables.MemberT;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.ApplicationEventPublisher;
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
        System.out.println("이벤트를 구독하기 전 입니다.");
        applicationEventPublisher.publishEvent(ss);
        System.out.println("이벤트를 구독했습니다.");
        return dsl.selectFrom(MemberT.MEMBER_T)
                .fetchInto(Member.class);
    }

}
