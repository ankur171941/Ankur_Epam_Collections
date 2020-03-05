package com.epam.CustomList;

import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;

import static com.epam.CustomList.MainClass.logger;

public class List<T>
{
    ArrayList<T> arrayList=new ArrayList<T>();
    void add(T element)
    {
        arrayList.add(element);
    }
    T get(int position)
    {
        return arrayList.get(position);
    }
    int position(T element)
    {
        return arrayList.indexOf(element);
    }
    void remove(int position)
    {
        arrayList.remove(arrayList.get(position));
    }
    void removelast()
    {
        arrayList.remove(arrayList.get(arrayList.size()-1));
    }
    void print()
    {
        logger.info(arrayList);

    }
}

