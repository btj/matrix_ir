package matrix_ir;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class represents a matrix (from algebra).
 * 
 * @immutable
 */
public class Matrix {

	/**
	 * @basic
	 * 
	 * @post | result != null
	 * @post | 1 <= result.length
	 * @post | Arrays.stream(result).allMatch(row -> row != null && row.length == result[0].length && 1 <= row.length)
	 * 
	 *         Arrays.stream(array).allMatch(e -> P(e))
	 *         forall e in array. P(e)
	 * 
	 * @creates | result, ...result
	 */
	public double[][] getElementsAsRowArrays() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result == getElementsAsRowArrays().length
	 */
	public int getNbRows() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result == getElementsAsRowArrays()[0].length
	 */
	public int getNbColumns() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result != null
	 * @post | result.length == getNbRows() * getNbColumns()
	 * @post | IntStream.range(0, getNbRows()).allMatch(rowIndex ->
	 *       |     IntStream.range(0, getNbColumns()).allMatch(columnIndex ->
	 *       |         result[rowIndex * getNbColumns() + columnIndex] == getElementsAsRowArrays()[rowIndex][columnIndex]))
	 * 
	 *         IntStream.range(a, b).allMatch(i -> P(i))
	 *         forall i. a <= i < b ==> P(i)
	 * 
	 * @creates | result
	 */
	public double[] getElementsRowMajor() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result != null
	 * @post | result.length == getNbRows() * getNbColumns()
	 * @post | IntStream.range(0, getNbRows()).allMatch(rowIndex ->
	 *       |     IntStream.range(0, getNbColumns()).allMatch(columnIndex ->
	 *       |         result[columnIndex * getNbRows() + rowIndex] == getElementsAsRowArrays()[rowIndex][columnIndex]))
	 * 
	 * @creates | result
	 */
	public double[] getElementsColumnMajor() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @throws IllegalArgumentException | nbRows < 1
	 * @throws IllegalArgumentException | nbColumns < 1
	 * @throws IllegalArgumentException | elementsRowMajor == null
	 * @throws IllegalArgumentException | elementsRowMajor.length != nbRows * nbColumns
	 * 
	 * @inspects | elementsRowMajor
	 * 
	 * @post | getNbRows() == nbRows
	 * @post | getNbColumns() == nbColumns
	 * @post | Arrays.equals(getElementsRowMajor(), elementsRowMajor)
	 */
	public Matrix(int nbRows, int nbColumns, double[] elementsRowMajor) {
		throw new RuntimeException("Not yet implemented");
	}
	
	/**
	 * @post | result != null
	 * @post | result.getNbRows() == getNbRows()
	 * @post | result.getNbColumns() == getNbColumns()
	 * @post | IntStream.range(0, getNbRows() * getNbColumns()).allMatch(i ->
	 *       |     result.getElementsRowMajor()[i] == getElementsRowMajor()[i] * scaleFactor)
	 */
	public Matrix scaled(double scaleFactor) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @inspects | other
	 * 
	 * @pre | other != null
	 * @pre | other.getNbRows() == getNbRows()
	 * @pre | other.getNbColumns() == getNbColumns()
	 * 
	 * @post | result != null
	 * @post | result.getNbRows() == getNbRows()
	 * @post | result.getNbColumns() == getNbColumns()
	 * @post | IntStream.range(0, getNbRows() * getNbColumns()).allMatch(i ->
	 *       |     result.getElementsRowMajor()[i] == getElementsRowMajor()[i] + other.getElementsRowMajor()[i])
	 */
	public Matrix plus(Matrix other) { throw new RuntimeException("Not yet implemented"); }
	
}
