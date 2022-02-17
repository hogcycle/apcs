class Matrix {
  int r; //rows
  int c; // columns
  double [][] array; // array
public Matrix(int r, int c) {
  this.r = r;
  this.c = c;
  array = new double[r][c];
}
public void set(int r, int c, double v) throws MatrixException {
  if (r > this.r || c > this.c || r < 0 || c < 0) { throw new MatrixException("cell does not exist"); } 
  else {
    this.array[r][c] = v; 
  }
}
public double get(int r, int c) throws MatrixException {
  if (c > this.c || r > this.r || r < 0 || c < 0) { throw new MatrixException("cell does not exist"); } 
  else {
    return array[r][c]; 
  }
}
public Matrix add(Matrix a, Matrix b) throws MatrixException {
  Matrix sum = new Matrix(this.r,this.c);
  if (a.c != b.c || a.r != b.r) { throw new MatrixException("Matrix size mismatch"); }
  if ( a == null || b == null ) { throw new MatrixException("Matrix is null"); }
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      sum.array[i][j] = a.array[i][j] + b.array[i][j];
    }
  }
return sum;
}
public Matrix sub(Matrix a, Matrix b) throws MatrixException {
  Matrix sum = new Matrix(this.r,this.c);
  if (a.c != b.c || a.r != b.r) { throw new MatrixException("Matrix size mismatch"); }
  if ( a == null || b == null ) { throw new MatrixException("Matrix is null"); }
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      sum.array[i][j] = a.array[i][j] - b.array[i][j];
    }
  }
return sum;
}
public Matrix mult(Matrix a, Matrix b) throws MatrixException {
  if (a.c != b.c || a.r != b.r) { throw new MatrixException("Matrix size mismatch"); }
  if ( a == null || b == null ) { throw new MatrixException("Matrix is null"); }
  Matrix sum = new Matrix(this.r,this.c);
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      sum.array[i][j] = 0;
        for (int k = 0; k < c; k++) {
      } 
    }
  }
return sum;
}
public Matrix mult(Matrix multiplier, double multiplicand) throws MatrixException {
  if (multiplier == null) { throw new MatrixException("Matrix is null"); }
  Matrix sum = new Matrix(this.r,this.c);
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      sum.array[i][j] = multiplier.array[i][j] * multiplicand;
    }
  }
  return sum;
}
public Matrix transpose(Matrix toTranspose) throws MatrixException {
  if (toTranspose == null) { throw new MatrixException("Matrix is null"); }
  Matrix transposed = new Matrix(this.r, this.c);
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      transposed.array[j][i] = toTranspose.array[i][j];
    }
  }
  return transposed;
}
public static void main(String[] args) {
  try {
    Matrix a = new Matrix(4,4);
    a.set(1,2,2);
    a.get(1,2);
  }
  catch(MatrixException e) {
  }
}

}

public class MatrixException extends Exception {
  public MatrixException() { super(); }
  public MatrixException (String s) { super (s); }
}
