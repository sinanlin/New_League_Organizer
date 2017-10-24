package com.mit.model;


public class Player implements Comparable<Player>{

  private String mFirstName;
  private String mLastName;
  private int mHeight;
  private boolean mExperience;


  public Player(String fistName, String lastName, int height, boolean experience){
    mFirstName = fistName;
    mLastName = lastName;
    mHeight = height;
    mExperience = experience;
  }


 public String getPlayerFirstName(){
   return mFirstName;
 }


public String getPlayerLastName(){
    return mLastName;
  }

public int getPlayerHeight(){
    return mHeight;
  }

public boolean getPlayerExperience(){
  return mExperience;
}


@Override
public int compareTo(Player p){
    if(mLastName.equals(p.getPlayerLastName())){
      if(mFirstName.equals(p.getPlayerFirstName())
        return 0;
      )
      else{
        return mFirstName.compareTo(p.getPlayerFirstName());
      }
    }else{
      return mLastName.compareTo(p.getPlayerLastName());
    }
}

}
