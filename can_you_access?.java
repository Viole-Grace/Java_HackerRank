o = new Inner().new Private();
System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
//alternate way of solving would be calling log(num)%log(2) from the math class. however, asks to call ((Sol.Inner.Private)o) in the statement - so solve using the powerof2(<var>) notation @ line 30.
//Also NOTE:: Sol->Inner->Private is a class->static_class->class call is also valid.
