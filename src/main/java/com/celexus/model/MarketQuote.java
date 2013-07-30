/**
 * Copyright 2013 Cameron Cook
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.celexus.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.celexus.foreman.ForemanException;
import com.celexus.foreman.TradeKingForeman;
import com.celexus.foreman.util.ResponseFormat;
import com.celexus.foreman.util.UtilityException;
import com.celexus.foreman.util.XMLHandler;
import com.celexus.foreman.util.builder.MarketBuilder;
import com.celexus.model.util.MarketQuotesResponseField;

public class MarketQuote
{
	private Map<MarketQuotesResponseField, String> map = new HashMap<MarketQuotesResponseField, String>();
	private TradeKingForeman foreman = new TradeKingForeman();

	public MarketQuote(String symbol, boolean streaming) throws UtilityException
	{
		XMLHandler handler = new XMLHandler();
		connectForeman();
		if (streaming)
		{
			handleStream(foreman.makeAPICallStream(MarketBuilder.getStreamingQuotes(ResponseFormat.XML, new String[] { symbol.trim().toUpperCase() })));
		}
		else
		{
			map = handler.parseMarketQuote(foreman.makeAPICall(MarketBuilder.getQuotes(ResponseFormat.XML, symbol.trim().toUpperCase())));

		}
	}

	private void handleStream(final BufferedReader reader)
	{
		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				String line;
				try
				{
					while (true)
					{
						line = reader.readLine();
						if(line != null)
						{
						}
					}
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();

	}

	public MarketQuote(String symbol, boolean streaming, MarketQuotesResponseField... fields) throws UtilityException
	{
		XMLHandler handler = new XMLHandler();
		connectForeman();
		if (streaming)
		{

		}
		else
		{
			map = handler.parseMarketQuote(foreman.makeAPICall(MarketBuilder.getQuotes(ResponseFormat.XML, new String[] { symbol.trim().toUpperCase() }, fields)));
		}
	}

	public boolean hasField(MarketQuotesResponseField f)
	{
		return map.containsKey(f);
	}

	public String getField(MarketQuotesResponseField f)
	{
		return map.get(f);

	}

	private void connectForeman() throws UtilityException
	{
		try
		{
			foreman.connect();
		}
		catch (ForemanException e)
		{
			throw new UtilityException("Unable to connect to the TradekingForeman", e);
		}
	}
}
