package ch07.sec06.packge2;

import ch07.sec06.packge1.A;

public class D extends A {

	public D() {
		super();

	}

	public void method1() {
		this.field = "value";
		this.method();
	}

	public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
