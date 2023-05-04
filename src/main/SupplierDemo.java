package main;

import java.time.LocalDate;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDate> {
	@Override
	public LocalDate get() {
		return LocalDate.now();
	}
}

public class SupplierDemo {

	public static void main(String[] args) {
//		Supplier<LocalDate> supplier = new SupplierImpl();
//		System.out.println(supplier.get());

		// doing this with lambda
		Supplier<LocalDate> supplier = () -> LocalDate.now();
		System.out.println(supplier.get());

	}

}
