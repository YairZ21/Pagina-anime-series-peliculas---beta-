//package com.aluracursos.screenmatch.Principal;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class EjemploStreams {
//
//    public void muestraEjemplo() {
//        // Ejemplo de uso de Streams en Java
//        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro", "Maria");
//
//        // Filtrar nombres que empiezan con 'A' y convertir a mayúsculas
//        nombres.stream()
//                .sorted()
//                .limit(8)
//                .filter(n -> n.startsWith("A"))
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);
//
//    }
//}        System.out.println("Bienvenido a Screenmatch");
/// /        //Busca los datos generales de la series
/// /        var nombreSerie = teclado.nextLine();
/// /        var json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
/// /        var datos = conversor.obtenerDatos(json, DatosSerie.class);
/// /        System.out.println(datos);
/// /
/// /        //Busca los datos de las tempopradas
/// /        List<DatosTemporadas> temporadas = new ArrayList<>();
/// /        for (int i = 1; i <= datos.totalTemporadas(); i++) {
/// /            json= consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + "&Season="+i+ API_KEY);
/// /            var datosTemporada = conversor.obtenerDatos(json, DatosTemporadas.class);
/// /            temporadas.add(datosTemporada);
/// /        }

// temporadas.forEach(System.out::println);

//mostrar  solo el titulo de cada episodio para cada temporada
//        for (int i = 0; i < datos.totalTemporadas(); i++){
//            List<DatosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
//simplicacion del codigo de arriba
//temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

//convetir todas las informaciones a una lista del tipo DatosEpisodio

//        List<DatosEpisodio> datosEpisodios = temporadas.stream()
//                .flatMap(t -> t.episodios().stream())
//                .collect(Collectors.toList());


//Top 5 episodios con mejor calificación
//        System.out.println("Top 5 episodios con mejor calificación:");
//        datosEpisodios.stream()
//                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println("Primer Filtro (N/A)" + e))
//                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
//                .peek(e -> System.out.println("Segundo ordenacion (M>m)" + e))
//                .limit(5)
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("Tercer Filtro Mayuscula (M>m)" + e))
//                .forEach(System.out::println);

//convirtiendo los datos en una lista de tipo episodio
//        List<Episodio> episodios = temporadas.stream()
//                .flatMap(t -> t.episodios().stream()
//                        .map(d -> new Episodio(t.numero(),d)))
//                .collect(Collectors.toList());

//episodios.forEach(System.out::println);

//Busqueda de episodios a partid de x año
//        System.out.println("Ingrese el año de los episodios que desea buscar:");
//        var fecha = teclado.nextInt();
//        teclado.nextLine();

//        LocalDate fechaBusqueda = LocalDate.of(fecha, 1, 1);

//        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(e -> e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaBusqueda))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getTemporada() +
//                                ", Episodio: " + e.getNumeroEpisodio() +
//                                ", Fecha de lanzamiento: " + e.getFechaDeLanzamiento().format(dtf)
//                ));
//Busca de episodios a partir de un titulo
//        System.out.println("Ingrese el titulo del episodio que desea buscar:");
//        var pedazoTitulo = teclado.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
//                .findFirst();
//        if (episodioBuscado.isPresent()){
//            System.out.println(" Episodio encontrado: ");
//            System.out.println("Los datos son: " + episodioBuscado.get());
//        }else {
//            System.out.println("No se encontró ningún episodio con ese título.");
//        }
//        Map<Integer , Double> evaluacionesPorTemporada = episodios.stream()
//                .filter(e -> e.getEvaluacion() > 0.0)
//                .collect(Collectors.groupingBy(Episodio::getTemporada,
//                        Collectors.averagingDouble(Episodio::getEvaluacion)));
//        System.out.println(evaluacionesPorTemporada);
//
//        DoubleSummaryStatistics est = episodios.stream()
//                .filter(e -> e.getEvaluacion() > 0.0)
//                .collect(Collectors.summarizingDouble(Episodio::getEvaluacion));
//        System.out.println("Media de las Evaluaciones: " + est.getAverage());
//        System.out.println("Episodios con mejor calificación: " + est.getMax());
//        System.out.println("Episodios con peor calificación: " + est.getMin());