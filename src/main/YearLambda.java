package main;

// Такая штука (интерфейс с одним методом) называется функциональным интерфейсом и используется для 
// Лямба выражений	
@FunctionalInterface
public interface YearLambda {
	int get(int value);
}
