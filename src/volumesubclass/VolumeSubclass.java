package volumesubclass;

class Volume {
    double radius;
}

class Sphere extends Volume {
    public void showVolume() {
        System.out.println(" Volume of sphere is " +  
                ((4 / 3) * Math.PI * Math.pow(radius, 3)));
    }
}

class Cone extends Volume {
    double height;
    public void showVolume() {
        System.out.println(" Volume of cone is " +
                Math.PI * Math.pow(radius, 2) * (height / 3));
    }
}

class Cube extends Volume {
    double edge;
    public void showVolume() {
        edge = radius * 2;
        System.out.println(" Volume of cube is " +
                (Math.pow((edge), 3)));
    }
}

public class VolumeSubclass {
    
    public static void main(String[] args) {
        
        Sphere smallSphere = new Sphere();
        smallSphere.radius = 2;
        
            smallSphere.showVolume();  
            
        Cone smallCone = new Cone();
        smallCone.height = 12;
        smallCone.radius = 24;
        
            smallCone.showVolume();
            
        Cube smallCube = new Cube();
        smallCube.radius = 12;
        
            smallCube.showVolume();
    }
}
