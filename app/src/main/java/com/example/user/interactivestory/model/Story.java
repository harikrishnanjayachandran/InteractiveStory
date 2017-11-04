package com.example.user.interactivestory.model;

import com.example.user.interactivestory.R;

/**
 * Created by User on 19-10-2017.
 */

public class Story {

    private Page[] pages;

    public Story()
    {
        pages=new Page[7];

        pages[0]=new Page(R.drawable.page0,
                R.string.page0,
                new choice(R.string.page0_choice1,1),
                new choice(R.string.page0_choice2,2));

        pages[1] = new Page(R.drawable.page1,
                R.string.page1,
                new choice(R.string.page1_choice1, 3),
                new choice(R.string.page1_choice2, 4));

        pages[2] = new Page(R.drawable.page2,
                R.string.page2,
                new choice(R.string.page2_choice1, 4),
                new choice(R.string.page2_choice2, 6));

        pages[3] = new Page(R.drawable.page3,
                R.string.page3,
                new choice(R.string.page3_choice1, 4),
                new choice(R.string.page3_choice2, 5));

        pages[4] = new Page(R.drawable.page4,
                R.string.page4,
                new choice(R.string.page4_choice1, 5),
                new choice(R.string.page4_choice2, 6));

        pages[5] = new Page(R.drawable.page5, R.string.page5);

        pages[6] = new Page(R.drawable.page6, R.string.page6);
    }


    public Page getPage(int pageNumber) {
        if(pageNumber>=pages.length)
        {
            pageNumber=0;
        }
        return pages[pageNumber];
    }
}
