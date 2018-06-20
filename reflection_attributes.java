public class Solution //use the Oracle docs to see syntax. Copy directly - no functionality changes.
{

        public static void main(String[] args){
            Class student = Student.class; //Student.class
            Method[] methods = student.getDeclaredMethods(); //student.getDeclaredMethods()

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods) //Method m : methods
            {
                methodList.add(m.getName()); //m.getName()
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
