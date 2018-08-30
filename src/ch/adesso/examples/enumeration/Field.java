package ch.adesso.examples.enumeration;

public enum Field {

    VALUE_1("Value_1"),
    VALUE_2("Value_2"),
    VALUE_3("Value_3");

    private String name;
    private String content;

    Field(String name) {
        this.name = name;
        this.content = "";
    }

    public String getName() {
    	return name;
    }

    public String getContent() {
    	return content;
    }

    public void setContent(String content) {
    	this.content = content;
    }

}
