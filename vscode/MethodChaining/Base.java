class Base {
    // 클래스 필드 (맴버변수)
    private String name;
    private String job;
    private int age;

    
    // 생성자 오버로딩
    Base() {
        this.name = "무명";
        this.job = "떠돌이";
        this.age = 1;
    }
    Base(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // 세터 메소드
    public Base setName(String name) {
        this.name = name;
        return this;
    }

    // 세터 메소드
    public Base setAge(int age) {
        this.age = age;
        return this;
    }

    //세터 메소드
    public String setJob(String job) {
        this.job = job;
        return this.job;
    }
    
    // 오버라이딩 toString()
    @Override
    public String toString() {
        return " [name=" + name 
        + ", age=" + age 
        + ", job=" + job 
        + "]";
    }
    
}
