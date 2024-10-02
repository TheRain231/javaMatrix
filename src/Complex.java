public class Complex {
    ///variables
    private double real;
    private double imag;

    ///init
    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }
    public Complex(Complex c) {
        this.real = c.real;
        this.imag = c.imag;
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex(double real) {
        this.real = real;
        this.imag = 0.0;
    }

    ///operations
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    public Complex sub(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    public Complex mul(Complex c) {
        double newReal = this.real * c.real - this.imag * c.imag;
        double newImag = this.real * c.imag + this.imag * c.real;
        return new Complex(newReal, newImag);
    }
    public Complex div(Complex c) {
        double newReal = (this.real * c.real + this.imag * c.imag) / (c.real * c.real + c.imag * c.imag);
        double newImag = (this.imag * c.real - this.real * c.imag) / (c.real * c.real + c.imag * c.imag);
        return new Complex(newReal, newImag);
    }
    ///methods
    public void print(){
        if (this.imag == 0.0) {
            System.out.print(this.real);
        }
        else if (this.real == 0.0) {
            System.out.print(this.imag + "i");
        }
        else {
            System.out.print(this.real);
            if (this.imag > 0.0) {
                System.out.print("+" + this.imag + "i");
            }
            else{
                System.out.print(this.imag + "i");
            }
        }
    }

    ///get, set
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

}
