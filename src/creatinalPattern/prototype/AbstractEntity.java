package creatinalPattern.prototype;

import java.util.Date;

public abstract class AbstractEntity {
    public int id;
    public Date createdTime;
    public Date updatedTime;

    public AbstractEntity() {
    }

    public AbstractEntity(AbstractEntity source) {
        //this();
        this.id = source.id;
        this.createdTime = source.createdTime;
        this.updatedTime = source.updatedTime;
    }

    public abstract AbstractEntity clone();


}
