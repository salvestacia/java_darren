public class Lingkaran {
    private double pi = 3.1415;
    
    Lingkaran(){
        
    }
    
    public double luas(int s1, int s2){
        return 0;
    }
    
    public double keliling(int s1, int s2){
        return 0;
    }
    
    public double luas(int r){ //method overload
        return (pi * r * r);
    }
    
    public double keliling(int r){ //method overload
        return (2 * pi * r);
    }
}
