package model;

public class User {
	private String userName;
	private String gender;
	private String age;
	private Double height;
	private Double weight;
	private Double bmiValue;
	private String determine; //自薦欄位
	
	public User(String username, String gender, String age, String height, String weight) {
		this.userName = username;
		this.gender = gender;
		this.age = age;
		this.height = Double.parseDouble(height);
		this.weight = Double.parseDouble(weight);
		//計算bmi
		this.bmiValue = this.weight / Math.pow(this.height/100, 2);
		//診斷
		determine();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getBmiValue() {
		return bmiValue;
	}
	
	public String getDetermine() {
		return determine;
	}

	public void setDetermine(String determine) {
		this.determine = determine;
	}

	public void setBmiValue(Double bmiValue) {
		this.bmiValue = bmiValue;
	}
	public void determine() {
		double min = 0, max= 0;
		switch (gender) {
			case "male":
				min = 17.4;
				max = 23.3;
				break;
			case "female":
				min = 17.1;
				max = 22.7;
				break;
		}
		String determine = bmiValue<min ?"過瘦": bmiValue> max? "過胖": "正常";
		this.determine = determine;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight="
				+ weight + ", bmiValue=" + bmiValue + ", toString()=" + super.toString() + "]";
	}
	
	
}
