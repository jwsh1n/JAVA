package ch07sec06packge2;

import ch07sec06packge1.A;

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
