package com.igenesys.springbootapp.model;

public enum ResponseStatus {

	 SUCCESS(0),  ERROR(1);
	  
	  private final int value;
	  
	  private ResponseStatus(int value)
	  {
	    this.value = value;
	  }
	  
	  public int getValue()
	  {
	    return this.value;
	  }
}
