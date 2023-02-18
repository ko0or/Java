class Base {
    // 클래스 필드 (맴버변수)
    private String name;
    private int age;

    // 생성자    
    Base() {}
    Base(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    // 오버라이딩 toString()
    @Override
    public String toString() {
        return getClass() + " [name=" + name + ", age=" + age + "]";
    }
    
}