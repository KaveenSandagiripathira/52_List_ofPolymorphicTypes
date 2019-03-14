# All_List_inArraySlots-with-Polymorphism-
## implement a list of diverse types with polymorphism
by Kaveen Sandagiripathira and Rachael Cheung

## List_inArraySlots Class
#### Fields:
```
private int filledElements; // the number of elements in this list

private Object[] list; // array containing elements of different types 

private static final int INITIAL_CAPACITY = 10; // initial capacity of the list
```

#### Constructor(s):
```
/** Constructor that: 
      -initiates Object array to have a size of INITIAL_CAPACITY */
public List_inArraySlots ()
```

#### Methods:
``` 
// Returns the number of elements in the list (not the capacity)
public int size() 

// Returns a String representation of the list (not including null elements)
public String toString()

// Returns element at a specific index from this list
public Element get (int index)

// Appends an element, "input", to the end of the Object array
public boolean add (Object input)

// Doubles the capacity of the list, preserving existing data
private void expand()

```

## UserOfList class:
- Creates an instance of List_inArraySlots
- tests methods in List_inArraySlots

## Point class:
- a new object type that can be added to the "list" in List_inArraySlots

