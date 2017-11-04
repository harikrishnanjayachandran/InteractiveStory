package com.example.user.interactivestory.model;

/**
 * Created by User on 17-10-2017.
 */

    public class Page
 {
    private int imageId;
    private int textId;
    private choice choice1;
    private choice choice2;
    private boolean isFinalPage=false;

    public boolean isFinalPage() 
{
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage)
 {
        isFinalPage = finalPage;
    }

    public Page(int imageId, int textId) {
        this.imageId = imageId;
        this.textId = textId;
        this.isFinalPage=true;

    }

    public Page(int imageId, int textId, choice choice1, choice choice2) {
        this.imageId = imageId;
        this.textId = textId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public choice getChoice1() { return choice1; }

    public void setChoice1(choice choice1) {
        this.choice1 = choice1;
    }

    public choice getChoice2() {
        return choice2;
    }

    public void setChoice2(choice choice2) {
        this.choice2 = choice2;
    }
}
