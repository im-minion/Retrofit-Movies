package in.vaibhav.com.retrofit_movies.model;

/**
 * Created by vaibhav on 15/4/17.
 */
import com.google.gson.annotations.SerializedName;

public class Genre {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public Genre() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public Genre(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}