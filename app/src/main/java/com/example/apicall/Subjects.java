package com.example.apicall;

class Subjects {
    private Integer credits;
    private String name;
    private String teacher;

    public Subjects(Integer credits, String name, String teacher) {
        this.credits = credits;
        this.name = name;
        this.teacher = teacher;
    }

        public Integer getCredits () {
            return credits;
        }
        public String getName () {
            return name;
        }
        public String getTeacher () {
            return teacher;
        }
    }


