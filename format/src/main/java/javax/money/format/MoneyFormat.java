/*
 *  Copyright 2012 Credit Suisse (Anatole Tresch)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.money.format;

import java.util.Locale;

/**
 * This class represent the singleton for money related formatting and parsing
 * functionality.
 * 
 * @author Anatole Tresch
 */
public final class MoneyFormat {

	/**
	 * Private singleton constructor.
	 */
	private MoneyFormat() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method allows to create a new {@link AmountFormatterBuilder} that
	 * can be used to create a {@link AmountFormatter} using programmatic
	 * configuration.
	 * 
	 * @return a new instance of a {@link AmountFormatterBuilder}, never null.
	 */
	public AmountFormatterBuilder createFormatterBuilder() {
		return null;
	}

	/**
	 * This method returns a parser instance for {@link Amount} instances
	 * formatted in the given {@link Locale}. The instance returned must be
	 * provided by the registered AmountParserFactory SPI implementation.
	 * 
	 * @param locale
	 *            The target locale. The locale will be converted into an
	 *            according {@link LocalizationStyle} using
	 *            {@link LocalizationStyle#of(Locale)}.
	 * @return the according parser, if available.
	 * @throws
	 */
	public AmountParser getAmountParser(Locale locale) {
		return null;
	}

	/**
	 * This method returns a parser instance for {@link Amount} instances
	 * formatted in the given {@link Locale}. The instance returned must be
	 * provided by the registered AmountParserFactory SPI implementation.
	 * 
	 * @param style
	 *            The target localization style.
	 * @return the according parser, if available.
	 * @throws
	 */
	public AmountParser getAmountParser(LocalizationStyle style) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link AmountFormatter} that is
	 * provided the registered AmountFormatterFactory SPI implementation.
	 * 
	 * @param locale
	 *            The target locale. The locale will be converted into an
	 *            according {@link LocalizationStyle} using
	 *            {@link LocalizationStyle#of(Locale)}.
	 * @return the formatter required, if available.
	 * @throws
	 */
	public AmountFormatter getAmountFormatter(Locale locale) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link AmountFormatter} that is
	 * provided the registered AmountFormatterFactory SPI implementation.
	 * 
	 * @param style
	 *            The target localization style.
	 * @return the formatter required, if available.
	 * @throws
	 */
	public AmountFormatter getAmountFormatter(LocalizationStyle style) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link CurrencyFormatter}.
	 * 
	 * @param style
	 *            The target localization style.
	 * @return a currency formatter.
	 */
	public CurrencyFormatter getCurrencyFormatter(LocalizationStyle style) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link CurrencyFormatter}.
	 * 
	 * @param locale
	 *            The target locale.
	 * @return a currency formatter.
	 */
	public CurrencyFormatter getCurrencyFormatter(Locale locale) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link CurrencyParser}.
	 * 
	 * @param namespace
	 *            the target name space of currencies.
	 * @param style
	 *            The target localization style.
	 * @return a currency formatter.
	 */
	public CurrencyParser getCurrencyParser(String namespace,
			LocalizationStyle style) {
		return null;
	}

	/**
	 * This method returns an instance of a {@link CurrencyParser}.
	 * 
	 * @param namespace
	 *            the target name space of currencies.
	 * @param locale
	 *            The target locale.
	 * @return a currency formatter.
	 */
	public CurrencyParser getCurrencyParser(String namespace, Locale locale) {
		return null;
	}

}
