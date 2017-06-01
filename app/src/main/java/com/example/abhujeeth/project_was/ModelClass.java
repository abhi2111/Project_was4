package com.example.abhujeeth.project_was;

/**
 * Created by abhujeeth on 5/25/17.
 */

public class ModelClass {
    int picIdone,picidtwo;

    public ModelClass(int picIdone,int picidtwo)
    {
        this.picIdone=picIdone;
        this.picidtwo=picidtwo;
    }

    int getPicIdone()
    {
        return picIdone;
    }
    int getPicidtwo()
    {
        return picidtwo;
    }
    void setPicId(int picId)
    {
        this.picIdone=picId;
    }
    void setPicidtwo(int picidtwo)
    {
       this.picidtwo=picidtwo;
    }

}
