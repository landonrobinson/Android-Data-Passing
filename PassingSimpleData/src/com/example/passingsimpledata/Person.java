package com.example.passingsimpledata;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
	String name, address;
	double age;
	
	public Person(String name, String address, double age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}//end of constructor

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age
				+ "]";
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeString(address);
		dest.writeDouble(age);
	}
	
public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
    
    public Person createFromParcel(Parcel in) {
    return new Person(in);
}

	public Person[] newArray(int size) {
    return new Person[size];
}
};

	private Person(Parcel in) {
		this.name = in.readString();
		this.address = in.readString();
		this.age = in.readDouble();
}

	
	
}//end of class