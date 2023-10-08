
  Virtual functions
 ßßßßßßßßßßßßßßßßßßß
Virtual functions let derived classes provide different versions of a base
class function.

You can declare a virtual function in a base class, then redefine it in any
derived class, even if the number and type of arguments are the same.

The redefined function overrides the base class function of the same name.
Virtual functions can only be member functions.

You can also declare the functions

  int Base::Fun(int)

and

  int Derived::Fun(int)

even when they are not virtual.

The base class version is available to derived class objects via scope
override.

If they are virtual, only the function associated with the actual type of
the object is available.

With virtual functions, you can't change just the function type. It is
illegal, therefore, to redefine a virtual function so that it differs only
in the return type.

If two functions with the same name have different arguments, C++ considers
them different, and the virtual function mechanism is ignored.
