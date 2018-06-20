class Flower  //defined variable name
{
    String whatsYourName() //defined name-variable
    {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower 
{
    @Override //override functionality
    String whatsYourName() 
    {
        return "Jasmine"; //set class type
    }
}

class Lily extends Flower 
{
    @Override
    String whatsYourName() 
    {
        return "Lily"; //override, reset
    }
}

class Lotus extends Flower 
{
    @Override
    String whatsYourName() 
    {
        return "Lotus"; //override, reset
    }
}

class State 
{
    Flower yourNationalFlower() 
    {
        return new Flower(); //return overriden values for each given instance of state, according to problem statement
    }
}

class WestBengal extends State 
{
    @Override //override the yourNationalFlower()
    Jasmine yourNationalFlower() 
    {
        return new Jasmine(); //object instance of returning
    }
}

class Karnataka extends State 
{
    @Override //recall override above
    Lotus yourNationalFlower() 
    { 
        return new Lotus(); //object re-referencing
    }
}

class AndhraPradesh extends State 
{
    @Override
    Lily yourNationalFlower() 
    {
        return new Lily(); //final referencing using class-overriden types. Refer q32,SA,ISC
    }
}
