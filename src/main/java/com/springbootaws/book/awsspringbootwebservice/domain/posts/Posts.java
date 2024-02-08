package com.springbootaws.book.awsspringbootwebservice.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/***
 * Setter 메서드가 없음
 *
 * 자바빈 규약을 생각하며 모두 생성하는 경우가 있는데,
 * 이렇게 되면 해당 클래스의 인스턴스 값들이 언제 어디서 변해야 하는지 코드상 명확하게 구분 불가능 -> 차후 기능 변경 시 정말 복잡해짐
 *
 * Entity 클래스에서는 절대 Setter 메서드를 만들지 않음.
 */

/**
 * Setter가 없으면 어떻게 값을 채워 DB에 삽입할까?
 *
 * 기본적으로 생성자를 통해 최종값을 채운 후 DB에 삽입하고, 값 변경이 필요한 경우 해당 이벤트에 맞는 public 메서드를 호출해 변경
 *
 * 하지만, 여기선 @Builder를 통해 제공되는 빌더 클래스 이용
 * => 지금 채워야 할 필드가 무엇인지 명확히 지정할 수 있기 때문
 */

@Getter
@NoArgsConstructor      // 기본 생성자 자동 추가
@Entity     // 테이블과 링크될 클래스임을 나타냄.
public class Posts {

    @Id     // 해당 테이블의 PK 필드 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)     // 테이블의 칼럼. 굳이 선언하지 않아도 클래스 내의 필드는 모두 칼럼이 됨. 기본값 외에 추가 변경이 필요한 경우 이용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
