package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class A{
	public A(){
		System.out.println("A생성자 호출");
	}
}
class B extends A {
	public B(){
		System.out.println("B생성자 호출");
	}
}

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();


	}

}
