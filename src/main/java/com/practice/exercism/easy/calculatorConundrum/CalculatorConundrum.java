package com.practice.exercism.easy.calculatorConundrum;

class CalculatorConundrum {

    private static final String NULL_OPERATION_MESSAGE = "Operation cannot be null";
    private static final String EMPTY_OPERATION_MESSAGE = "Operation cannot be empty";
    private static final String DIVISION_BY_ZERO_MESSAGE = "Division by zero is not allowed";
    private static final String OPERATION_DOES_NOT_EXIST_MESSAGE = "Operation '%s' does not exist";

    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException(NULL_OPERATION_MESSAGE);
        }
        if (operation.isBlank()) {
            throw new IllegalArgumentException(EMPTY_OPERATION_MESSAGE);
        }

        int result = getResult(operand1, operand2, operation);
        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }

    private static int getResult(int operand1, int operand2, String operation) {
        int result;
        switch (operation) {
            case "+" -> result = operand1 + operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> {
                try {
                    result = operand1 / operand2;
                }
                catch (ArithmeticException e) {
                    throw new IllegalOperationException(DIVISION_BY_ZERO_MESSAGE, e);
                }
            }
            default -> throw new IllegalOperationException(
                    String.format(OPERATION_DOES_NOT_EXIST_MESSAGE, operation)
            );

        }
        return result;
    }
}