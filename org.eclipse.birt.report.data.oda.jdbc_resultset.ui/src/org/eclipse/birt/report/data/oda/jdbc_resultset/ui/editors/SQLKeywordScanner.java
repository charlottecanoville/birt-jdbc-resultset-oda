/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.data.oda.jdbc_resultset.ui.editors;

import java.util.ArrayList;

import org.eclipse.birt.report.data.oda.jdbc_resultset.ui.util.ColorManager;
import org.eclipse.birt.report.data.oda.jdbc_resultset.utils.ISQLSyntax;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

/**
 * TODO: Please document
 * 
 * @version $Revision: 1.5 $ $Date: 2010/05/18 07:51:31 $
 */

public class SQLKeywordScanner extends RuleBasedScanner implements ISQLSyntax
{
	/**
	 *  
	 */
	public SQLKeywordScanner( )
	{
		super( );
		IToken sqlKeywordsToken = new Token( new TextAttribute( ColorManager.getColor(127, 0, 85), null, SWT.BOLD ) );
		ArrayList rules = new ArrayList( );
		rules.add( new SQLKeywordRule( sqlKeywordsToken, reservedwords ) );
		rules.add( new SQLKeywordRule( sqlKeywordsToken, types ) );
		rules.add( new SQLKeywordRule( sqlKeywordsToken, constants ) );
		rules.add( new SQLKeywordRule( sqlKeywordsToken, functions ) );
		rules.add( new SQLKeywordRule( sqlKeywordsToken, predicates ) );
		
		// Add generic whitespace rule.
		rules.add( new WhitespaceRule( new IWhitespaceDetector( ) {

			public boolean isWhitespace( char c )
			{
				return Character.isWhitespace( c );
			}
		} ) );

		setRules( (IRule[]) rules.toArray( new IRule[rules.size( )] ) );
		this.setDefaultReturnToken( new Token( new TextAttribute( Display.getDefault( ).getSystemColor( SWT.COLOR_LIST_FOREGROUND ))));
	}

}