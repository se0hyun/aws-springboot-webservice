package com.springbootaws.book.awsspringbootwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity Class와 기본 Entity Repository는 함께 위치해있어야 함.
// Entity Class는 기본 Repository 없이 제대로 역할을 할 수 없음.

public interface PostsRepository extends JpaRepository<Posts, Long> {   // JpaRepository<Entity 클래스, PK 타입> -> 기본적인 CRUD 메서드 자동 생성
}
