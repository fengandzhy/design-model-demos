package org.zhouhy.desing.model.adapter.md02.adapter;

import org.zhouhy.desing.model.adapter.md02.adaptee.Adaptee;
import org.zhouhy.desing.model.adapter.md02.target.Target;

/**
 * ����������
 * */
public class Adapter extends Target{
	
	private Adaptee adaptee;
	
	public Adapter (Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void targetMethod1() {
		System.out.println("Adapter targetMethond1 invoked!");
		adaptee.methodA();
	}

	@Override
	public void targetMethod2() {
		System.out.println("Adapter targetMethond2 invoked!");
		adaptee.methodB();
	}
}
