package com.example.jooqstarter.entity;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberQueryRepository {

    private final DSLContext dsl;

    public MemberQueryRepository(final DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<Member> getList1() {
        return dsl.select(DSL.field("id"), DSL.field("name"))
                .from(DSL.table("user_t"))
                .fetchInto(Member.class);
    }

}
