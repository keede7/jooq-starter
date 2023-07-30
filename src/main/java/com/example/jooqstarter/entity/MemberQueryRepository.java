package com.example.jooqstarter.entity;

import com.example.jooqstarter.dto.ModifyNameRequest;
import nu.studer.sample.jooqdb.tables.MemberT;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

import static nu.studer.sample.jooqdb.tables.MemberT.*;

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
        return dsl.selectFrom(MEMBER_T)
                .fetchInto(Member.class);
    }

    @Transactional
    public void modifyName(ModifyNameRequest modifyNameRequest) {
        dsl.update(MEMBER_T)
                .set(MEMBER_T.NAME, modifyNameRequest.name())
                .where(MEMBER_T.ID.eq(modifyNameRequest.id()))
                .execute();

        applicationEventPublisher.publishEvent(modifyNameRequest);
    }
}
