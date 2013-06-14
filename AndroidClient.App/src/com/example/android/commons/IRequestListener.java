package com.example.android.commons;

import com.example.android.exceptions.ExampleException;

public interface IRequestListener<T> {
  
	/**
	 * �����������
	 * @param bean
	 */
    public void onComplete(T bean);
    
    /**
     * ��������
     * @param fault
     */
    public void onFault(Throwable fault);
 
    /**
     * �����Զ����쳣
     * @param exampleException
     */
    public void onExampleException(ExampleException exampleException);
 
}