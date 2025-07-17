//package com.aluracursos.screenmatch.service;
//
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//public class ConsultaChatGPT {
//    public static String obtenerTraduccion(String texto) {
//        OpenAiService service = new OpenAiService("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");
//
//        CompletionRequest requisicion = CompletionRequest.builder()
//                .model("gpt-4.1")
//                .prompt("traduce a español el siguiente texto: " + texto)
//                .maxTokens(1000)
//                .temperature(0.7)
//                .build();
//
//        var respuesta = service.createCompletion(requisicion);
//        return respuesta.getChoices().get(0).getText();
//    }
//}