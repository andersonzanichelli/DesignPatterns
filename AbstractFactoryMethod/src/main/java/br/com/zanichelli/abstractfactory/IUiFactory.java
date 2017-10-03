package br.com.zanichelli.abstractfactory;

public interface IUiFactory {

	IButton getButton();
	IAlert getAlert();
}
