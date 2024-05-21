package coutinho.guilherme.bytebank.domain.conta;

import coutinho.guilherme.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
