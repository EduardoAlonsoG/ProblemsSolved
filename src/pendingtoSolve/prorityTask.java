package PendingToSolve;
import java.util.ArrayList;
import java.util.List;

public class prorityTask {
    public static Long getMinimumTime(int n, List<Integer> high_priority, int normal_time, int priority_time) {
        // Array to mark high-priority processes
        boolean[] isHighPriority = new boolean[n];
        for (int idx : high_priority) {
            isHighPriority[idx - 1] = true; // Marcar procesos de alta prioridad
        }

        // Calcular el tiempo de ejecución para todo el arreglo sin dividir
        long totalTimeWithoutSplit = calculateExecutionTime(0, n - 1, isHighPriority, normal_time, priority_time);
        long minTime = totalTimeWithoutSplit;

        // Probar todas las posibles divisiones del arreglo en dos subarreglos
        for (int i = 0; i < n - 1; i++) {
            long leftTime = calculateExecutionTime(0, i, isHighPriority, normal_time, priority_time);
            long rightTime = calculateExecutionTime(i + 1, n - 1, isHighPriority, normal_time, priority_time);
            minTime = Math.min(minTime, leftTime + rightTime);
        }

        return minTime;
    }

    // Método auxiliar para calcular el tiempo necesario para ejecutar procesos en un rango
    private static long calculateExecutionTime(int start, int end, boolean[] isHighPriority, int normal_time, int priority_time) {
        long time = 0;
        for (int i = start; i <= end; i++) {
            if (isHighPriority[i]) {
                // Si es de alta prioridad, agregar el tiempo correspondiente
                time += priority_time;
            } else {
                // Si no, agregar el tiempo normal
                time += normal_time;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        // Prueba con los casos de ejemplo
        testGetMinimumTime(4, List.of(1), 2, 2, 6);           // Esperado: 6
        testGetMinimumTime(4, List.of(1, 2), 5, 100, 12);     // Esperado: 12
        testGetMinimumTime(5, List.of(2, 4), 3, 5, 23);       // Esperado: 23
        testGetMinimumTime(6, List.of(1, 3, 5), 4, 6, 34);    // Esperado: 34
        testGetMinimumTime(7, List.of(7), 2, 10, 22);         // Esperado: 22
    }
    private static void testGetMinimumTime(int n, List<Integer> high_priority, int normal_time, int priority_time, long expected) {
        long result = getMinimumTime(n, high_priority, normal_time, priority_time);
        if (result == expected) {
            System.out.println("Prueba pasada. Resultado: " + result + " Esperado: " + expected);
        } else {
            System.out.println("Prueba fallida. Resultado: " + result + " Esperado: " + expected);
        }
    }
}
