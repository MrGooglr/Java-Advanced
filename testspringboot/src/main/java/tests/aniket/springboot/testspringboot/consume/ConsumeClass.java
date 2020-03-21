package tests.aniket.springboot.testspringboot.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsumeClass {

	private String type;
	private Value value;

	public ConsumeClass() {

	}

	public String getType() {
		return type;
	}

	public Value getValue() {
		return value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
	}
}
