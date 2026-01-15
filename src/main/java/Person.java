/**
 * Represents a person with basic physical and appearance properties.
 * @author Kumail
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    /**
     * Constructs a Person using all instance variables.
     *
     * @param name       person's name
     * @param age        person's age
     * @param height     person's height
     * @param weight     person's weight
     * @param eyeColour  person's eye colour
     * @param hairColour person's hair colour
     */
    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    /** 
     * @return the name 
    */
    public String getName() { return name; }
    /** 
     * @return the age 
    */
    public int getAge() { return age; }
    /** 
     * @return the height 
    */
    public int getHeight() { return height; }
    /**
     * @return the weight 
    */
    public int getWeight() { return weight; }
    /** 
     * @return the eye colour 
     */
    public String getEyeColour() { return eyeColour; }
    /** 
     * @return the hair colour
    */
    public String getHairColour() { return hairColour; }
}