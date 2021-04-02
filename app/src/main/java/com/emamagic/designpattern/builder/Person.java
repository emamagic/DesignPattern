package com.emamagic.designpattern.builder;

public class Person {

    private final String name;
    private final String family;
    private final String phone;
    private final int age;

    private Person(String name, String family, String phone, int age) {
        this.name = name;
        this.family = family;
        this.phone = phone;
        this.age = age;
    }

    public static class Builder {

        private String name;
        private String family;
        private String phone;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder family(String family) {
            this.family = family;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this.name ,this.family ,this.phone ,this.age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
