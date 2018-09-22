package com.datastructure.array;

/**
 * Created by Kiran on 9/20/18.
 */
import java.util.Arrays;

public class DynamicArray
{
    // The storage for the elements.
    // The capacity is the length of this array.
    private int[] data;

    // The number of elements (logical size).
    // It must be smaller than the capacity.
    private int size;

    // Constructs an empty DynamicArray
    public DynamicArray()
    {
        data = new int[16];
        size = 0;
    }

    // Constructs an empty DynamicArray with the
    // specified initial capacity.
    public DynamicArray(int capacity)
    {
        if (capacity < 16)
            capacity = 16;
        data = new int[capacity];
        size = 0;
    }

    // Increases the capacity, if necessary, to ensure that
    // it can hold at least the number of elements
    // specified by the minimum capacity argument.
    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity)
        {
            int newCapacity = (oldCapacity * 2);
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    // Returns the logical size
    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    // Checks if the given index is in range.
    private void rangeCheck(int index)
    {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index: " +
                    index + ", Size: " + size);
    }

    // Returns the element at the specified position.
    public int get(int index)
    {
        rangeCheck(index);
        return data[index];
    }

    // Appends the specified element to the end.
    public boolean add(int element)
    {
        ensureCapacity(size + 1);
        data[size++] = element;
        return true;
    }

    // Removes all of the elements.
    public void clear()
    {
        size = 0;
    }

    // Replaces the element at the specified position
    public int set(int index, int element)
    {
        rangeCheck(index);
        int oldValue = data[index];
        data[index] = element;
        return oldValue;
    }

    public int capacity()
    {
        return data.length;
    }
}