package com.param.Contest.FakeStoreApi;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter

public class Cart {
    public int id;
    public int userId;
    public Date date;
    public ArrayList<Product> products;
}
