package io.member;

import java.io.Serializable;

/*
  객체 직렬화
  - ObjectStream 사용을 위해 Member 객체에 Serializable 인터페이스 구현.
  - Serializable 인터페이스는 아무런 기능이 없다. 단지 직렬화 가능한 클래스라는 것을 표시하기 위한 인터페이스일 뿐.
  - 메서드 없이 단지 표시가 목적인 인터페이스를 마커 인터페이스라 한다.
  - 메모리에 있는 객체 인스턴스를 바이트 스트림으로 변환하여 파일에 저장하거나 네트워크를 통해 전송할 수 있도록 하는 기능.
  - 이 과정에서 객체의 상태를 유지하여 나중에 역직렬화(Deserialization)를 통해 원래의 객체로 복원.
 */
public class Member implements Serializable {
    private String id;
    private String name;
    private Integer age;

    public Member() {
    }

    public Member(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
