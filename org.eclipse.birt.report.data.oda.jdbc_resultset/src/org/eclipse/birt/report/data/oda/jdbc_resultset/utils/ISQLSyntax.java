/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.data.oda.jdbc_resultset.utils;

/**
 * TODO: Please document
 * 
 * @version $Revision: 1.1 $ $Date: 2009/07/07 06:50:25 $
 */

public interface ISQLSyntax
{

	public static final String[] reservedwords = {
			"absolute", //$NON-NLS-1$
			"acquire", //$NON-NLS-1$
			"action", //$NON-NLS-1$
			"add", //$NON-NLS-1$
			"all", //$NON-NLS-1$
			"allocate", //$NON-NLS-1$
			"alter", //$NON-NLS-1$
			"and", //$NON-NLS-1$
			"any", //$NON-NLS-1$
			"are", //$NON-NLS-1$
			"as", //$NON-NLS-1$
			"asc", //$NON-NLS-1$
			"assertion", //$NON-NLS-1$
			"at", //$NON-NLS-1$
			"audit", //$NON-NLS-1$
			"authorization", //$NON-NLS-1$
			"avg", //$NON-NLS-1$
			"begin", //$NON-NLS-1$
			"between", //$NON-NLS-1$
			"bit_length", //$NON-NLS-1$
			"both", //$NON-NLS-1$
			"bufferpool", //$NON-NLS-1$
			"by", //$NON-NLS-1$
			"call", //$NON-NLS-1$
			"capture", //$NON-NLS-1$
			"cascaded", //$NON-NLS-1$
			"case", //$NON-NLS-1$
			"cast", //$NON-NLS-1$
			"catalog", //$NON-NLS-1$
			"ccsid", //$NON-NLS-1$
			"char", //$NON-NLS-1$
			"char_length", //$NON-NLS-1$
			"character", //$NON-NLS-1$
			"character_length", //$NON-NLS-1$
			"check", //$NON-NLS-1$
			"close", //$NON-NLS-1$
			"cluster", //$NON-NLS-1$
			"coalesce", //$NON-NLS-1$
			"collate", //$NON-NLS-1$
			"collation", //$NON-NLS-1$
			"collection", //$NON-NLS-1$
			"column", //$NON-NLS-1$
			"comment", //$NON-NLS-1$
			"commit", //$NON-NLS-1$
			"concat", //$NON-NLS-1$
			"connect", //$NON-NLS-1$
			"connection", //$NON-NLS-1$
			"constraint", //$NON-NLS-1$
			"constraints", //$NON-NLS-1$
			"continue", //$NON-NLS-1$
			"convert", //$NON-NLS-1$
			"corresponding", //$NON-NLS-1$
			"count", //$NON-NLS-1$
			"create", //$NON-NLS-1$
			"cross", //$NON-NLS-1$
			"current", //$NON-NLS-1$
			"current_date", //$NON-NLS-1$
			"current_server", //$NON-NLS-1$
			"current_time", //$NON-NLS-1$
			"current_timestamp", //$NON-NLS-1$
			"current_timezone", //$NON-NLS-1$
			"current_user", //$NON-NLS-1$
			"cursor", //$NON-NLS-1$
			"database", //$NON-NLS-1$
			"date", //$NON-NLS-1$
			"day", //$NON-NLS-1$
			"days", //$NON-NLS-1$
			"dba", //$NON-NLS-1$
			"dbspace", //$NON-NLS-1$
			"deallocate", //$NON-NLS-1$
			"dec", //$NON-NLS-1$
			"decimal", //$NON-NLS-1$
			"declare", //$NON-NLS-1$
			"default", //$NON-NLS-1$
			"deferrable", //$NON-NLS-1$
			"deferred", //$NON-NLS-1$
			"delete", //$NON-NLS-1$
			"desc", //$NON-NLS-1$
			"describe", //$NON-NLS-1$
			"descriptor", //$NON-NLS-1$
			"diagnostics", //$NON-NLS-1$
			"disconnect", //$NON-NLS-1$
			"distinct", //$NON-NLS-1$
			"domain", //$NON-NLS-1$
			"double", //$NON-NLS-1$
			"drop", //$NON-NLS-1$
			"editproc", //$NON-NLS-1$
			"else", //$NON-NLS-1$
			"end", //$NON-NLS-1$
			"end-exec", //$NON-NLS-1$
			"erase", //$NON-NLS-1$
			"escape", //$NON-NLS-1$
			"except", //$NON-NLS-1$
			"exception", //$NON-NLS-1$
			"exclusive", //$NON-NLS-1$
			"execute", //$NON-NLS-1$
			"exists", //$NON-NLS-1$
			"explain", //$NON-NLS-1$
			"external", //$NON-NLS-1$
			"extract", //$NON-NLS-1$
			"fetch", //$NON-NLS-1$
			"fieldproc", //$NON-NLS-1$
			"first", //$NON-NLS-1$
			"float", //$NON-NLS-1$
			"for", //$NON-NLS-1$
			"foreign", //$NON-NLS-1$
			"found", //$NON-NLS-1$
			"from", //$NON-NLS-1$
			"full", //$NON-NLS-1$
			"full", //$NON-NLS-1$
			"get", //$NON-NLS-1$
			"global", //$NON-NLS-1$
			"go", //$NON-NLS-1$
			"goto", //$NON-NLS-1$
			"grant", //$NON-NLS-1$
			"graphic", //$NON-NLS-1$
			"group", //$NON-NLS-1$
			"having", //$NON-NLS-1$
			"hour", //$NON-NLS-1$
			"hours", //$NON-NLS-1$
			"identified", //$NON-NLS-1$
			"identity", //$NON-NLS-1$
			"immediate", //$NON-NLS-1$
			"in", //$NON-NLS-1$
			"index", //$NON-NLS-1$
			"indicator", //$NON-NLS-1$
			"initially", //$NON-NLS-1$
			"inner", //$NON-NLS-1$
			"inner", //$NON-NLS-1$
			"inout", //$NON-NLS-1$
			"input", //$NON-NLS-1$
			"insensitive", //$NON-NLS-1$
			"insert", //$NON-NLS-1$
			"intersect", //$NON-NLS-1$
			"interval", //$NON-NLS-1$
			"into", //$NON-NLS-1$
			"is", //$NON-NLS-1$
			"isolation", //$NON-NLS-1$
			"join", //$NON-NLS-1$
			"join", //$NON-NLS-1$
			"key", //$NON-NLS-1$
			"label", //$NON-NLS-1$
			"language", //$NON-NLS-1$
			"last", //$NON-NLS-1$
			"leading", //$NON-NLS-1$
			"left", //$NON-NLS-1$
			"left", //$NON-NLS-1$
			"level", //$NON-NLS-1$
			"like", //$NON-NLS-1$
			"local", //$NON-NLS-1$
			"lock", //$NON-NLS-1$
			"locksize", //$NON-NLS-1$
			"long", //$NON-NLS-1$
			"lower", //$NON-NLS-1$
			"match", //$NON-NLS-1$
			"max", //$NON-NLS-1$
			"microsecond", //$NON-NLS-1$
			"microseconds", //$NON-NLS-1$
			"min", //$NON-NLS-1$
			"minute", //$NON-NLS-1$
			"minutes", //$NON-NLS-1$
			"mode", //$NON-NLS-1$
			"module", //$NON-NLS-1$
			"month", //$NON-NLS-1$
			"months", //$NON-NLS-1$
			"named", //$NON-NLS-1$
			"names", //$NON-NLS-1$
			"national", //$NON-NLS-1$
			"natural", //$NON-NLS-1$
			"nchar", //$NON-NLS-1$
			"next", //$NON-NLS-1$
			"nheader", //$NON-NLS-1$
			"no", //$NON-NLS-1$
			"not", //$NON-NLS-1$
			"null", //$NON-NLS-1$
			"nullif", //$NON-NLS-1$
			"numeric", //$NON-NLS-1$
			"numparts", //$NON-NLS-1$
			"obid", //$NON-NLS-1$
			"octet_length", //$NON-NLS-1$
			"of", //$NON-NLS-1$
			"on", //$NON-NLS-1$
			"only", //$NON-NLS-1$
			"open", //$NON-NLS-1$
			"optimize", //$NON-NLS-1$
			"option", //$NON-NLS-1$
			"or", //$NON-NLS-1$
			"order", //$NON-NLS-1$
			"out", //$NON-NLS-1$
			"outer", //$NON-NLS-1$
			"output", //$NON-NLS-1$
			"overlaps", //$NON-NLS-1$
			"package", //$NON-NLS-1$
			"pad", //$NON-NLS-1$
			"page", //$NON-NLS-1$
			"pages", //$NON-NLS-1$
			"part", //$NON-NLS-1$
			"partial", //$NON-NLS-1$
			"pctfree", //$NON-NLS-1$
			"pctindex", //$NON-NLS-1$
			"plan", //$NON-NLS-1$
			"position", //$NON-NLS-1$
			"precision", //$NON-NLS-1$
			"prepare", //$NON-NLS-1$
			"preserve", //$NON-NLS-1$
			"primary", //$NON-NLS-1$
			"prior", //$NON-NLS-1$
			"priqty", //$NON-NLS-1$
			"private", //$NON-NLS-1$
			"privileges", //$NON-NLS-1$
			"procedure", //$NON-NLS-1$
			"program", //$NON-NLS-1$
			"public", //$NON-NLS-1$
			"read", //$NON-NLS-1$
			"real", //$NON-NLS-1$
			"references", //$NON-NLS-1$
			"relative", //$NON-NLS-1$
			"release", //$NON-NLS-1$
			"reset", //$NON-NLS-1$
			"resource", //$NON-NLS-1$
			"revoke", //$NON-NLS-1$
			"right", //$NON-NLS-1$
			"right", //$NON-NLS-1$
			"rollback", //$NON-NLS-1$
			"row", //$NON-NLS-1$
			"rows", //$NON-NLS-1$
			"rrn", //$NON-NLS-1$
			"run", //$NON-NLS-1$
			"schedule", //$NON-NLS-1$
			"schema", //$NON-NLS-1$
			"scroll", //$NON-NLS-1$
			"second", //$NON-NLS-1$
			"seconds", //$NON-NLS-1$
			"secqty", //$NON-NLS-1$
			"section", //$NON-NLS-1$
			"select", //$NON-NLS-1$
			"session", //$NON-NLS-1$
			"session_user", //$NON-NLS-1$
			"set", //$NON-NLS-1$
			"share", //$NON-NLS-1$
			"simple", //$NON-NLS-1$
			"size", //$NON-NLS-1$
			"smallint", //$NON-NLS-1$
			"some", //$NON-NLS-1$
			"space", //$NON-NLS-1$
			"sql", //$NON-NLS-1$
			"sqlcode", //$NON-NLS-1$
			"sqlerror", //$NON-NLS-1$
			"sqlstate", //$NON-NLS-1$
			"statistics", //$NON-NLS-1$
			"stogroup", //$NON-NLS-1$
			"storpool", //$NON-NLS-1$
			"subpages", //$NON-NLS-1$
			"substring", //$NON-NLS-1$
			"sum", //$NON-NLS-1$
			"synonym", //$NON-NLS-1$
			"system_user", //$NON-NLS-1$
			"table", //$NON-NLS-1$
			"tablespace", //$NON-NLS-1$
			"temporary", //$NON-NLS-1$
			"then", //$NON-NLS-1$
			"timezone_hour", //$NON-NLS-1$
			"timezone_minute", //$NON-NLS-1$
			"to", //$NON-NLS-1$
			"trailing", //$NON-NLS-1$
			"transaction", //$NON-NLS-1$
			"translation", //$NON-NLS-1$
			"trim", //$NON-NLS-1$
			"union", //$NON-NLS-1$
			"unique", //$NON-NLS-1$
			"unknown", //$NON-NLS-1$
			"update", //$NON-NLS-1$
			"upper", //$NON-NLS-1$
			"usage", //$NON-NLS-1$
			"user", //$NON-NLS-1$
			"using", //$NON-NLS-1$
			"validproc", //$NON-NLS-1$
			"value", //$NON-NLS-1$
			"values", //$NON-NLS-1$
			"varchar", //$NON-NLS-1$
			"variable", //$NON-NLS-1$
			"varying", //$NON-NLS-1$
			"vcat", //$NON-NLS-1$
			"view", //$NON-NLS-1$
			"volumes", //$NON-NLS-1$
			"when", //$NON-NLS-1$
			"whenever", //$NON-NLS-1$
			"where", //$NON-NLS-1$
			"with", //$NON-NLS-1$
			"work", //$NON-NLS-1$
			"write", //$NON-NLS-1$
			"year", //$NON-NLS-1$
			"years", //$NON-NLS-1$
			"zone", //$NON-NLS-1$
			"false", //$NON-NLS-1$
			"true" //$NON-NLS-1$
	};

	public static final String[] predicates = {
			"< >", //$NON-NLS-1$
			"=", //$NON-NLS-1$
			"<", //$NON-NLS-1$
			">", //$NON-NLS-1$
			"<=", //$NON-NLS-1$
			">=", //$NON-NLS-1$
			"+", //$NON-NLS-1$
			"-", //$NON-NLS-1$
			"*", //$NON-NLS-1$
			"/", //$NON-NLS-1$
			"%", //$NON-NLS-1$
			"|", //$NON-NLS-1$
			":", //$NON-NLS-1$
			".", //$NON-NLS-1$
			"[ ]", //$NON-NLS-1$
			"::", //$NON-NLS-1$
			"union", //$NON-NLS-1$
			"is", //$NON-NLS-1$
			"is null", //$NON-NLS-1$
			"not null", //$NON-NLS-1$
			"is of", //$NON-NLS-1$
			"in", //$NON-NLS-1$
			"between", //$NON-NLS-1$
			"overlaps", //$NON-NLS-1$
			"like", //$NON-NLS-1$
			"not", //$NON-NLS-1$
			"and", //$NON-NLS-1$
			"or", //$NON-NLS-1$
			"some", //$NON-NLS-1$
			"any", //$NON-NLS-1$
			"all", //$NON-NLS-1$
			"exists" //$NON-NLS-1$
	};

	public static final String[] types = {
			"integer", //$NON-NLS-1$
			"smallinteger", //$NON-NLS-1$
			"bigint", //$NON-NLS-1$
			"decimal", //$NON-NLS-1$
			"double", //$NON-NLS-1$
			"real", //$NON-NLS-1$
			"time", //$NON-NLS-1$
			"timestamp", //$NON-NLS-1$
			"date", //$NON-NLS-1$
			"datalink", //$NON-NLS-1$
			"char", //$NON-NLS-1$
			"varchar", //$NON-NLS-1$
			"blob", //$NON-NLS-1$
			"clob", //$NON-NLS-1$
			"graphic", //$NON-NLS-1$
			"vargraphic", //$NON-NLS-1$
			"dbclob" //$NON-NLS-1$
	};

	public static final String[] constants = {
			"false", "true", "null" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	};

	public static final String[] functions = {
			"abs", //$NON-NLS-1$
			"absval", //$NON-NLS-1$
			"acos", //$NON-NLS-1$
			"ascii", //$NON-NLS-1$
			"asin", //$NON-NLS-1$
			"atan", //$NON-NLS-1$
			"atan2", //$NON-NLS-1$
			"bigint", //$NON-NLS-1$
			"blob", //$NON-NLS-1$
			"ceiling", //$NON-NLS-1$
			"char", //$NON-NLS-1$
			"chr", //$NON-NLS-1$
			"clob", //$NON-NLS-1$
			"coalesce", //$NON-NLS-1$
			"concat", //$NON-NLS-1$
			"correlation", //$NON-NLS-1$
			"cos", //$NON-NLS-1$
			"cot", //$NON-NLS-1$
			"count", //$NON-NLS-1$
			"count_big", //$NON-NLS-1$
			"covariance", //$NON-NLS-1$
			"date", //$NON-NLS-1$
			"day", //$NON-NLS-1$
			"dayname", //$NON-NLS-1$
			"dayofweek", //$NON-NLS-1$
			"dayofweek_iso", //$NON-NLS-1$
			"dayofyear", //$NON-NLS-1$
			"days", //$NON-NLS-1$
			"dbclob", //$NON-NLS-1$
			"decimal", //$NON-NLS-1$
			"degrees", //$NON-NLS-1$
			"deref", //$NON-NLS-1$
			"difference", //$NON-NLS-1$
			"digits", //$NON-NLS-1$
			"dlcomment", //$NON-NLS-1$
			"dllinktype", //$NON-NLS-1$
			"dlurlcomplete", //$NON-NLS-1$
			"dlurlpath", //$NON-NLS-1$
			"dlurlpathonly", //$NON-NLS-1$
			"dlurlscheme", //$NON-NLS-1$
			"dlurlserver", //$NON-NLS-1$
			"dlvalue", //$NON-NLS-1$
			"double", //$NON-NLS-1$
			"event_mon_state", //$NON-NLS-1$
			"exp", //$NON-NLS-1$
			"float", //$NON-NLS-1$
			"floor", //$NON-NLS-1$
			"generate_unique", //$NON-NLS-1$
			"graphic", //$NON-NLS-1$
			"grouping", //$NON-NLS-1$
			"hex", //$NON-NLS-1$
			"hour", //$NON-NLS-1$
			"insert", //$NON-NLS-1$
			"integer", //$NON-NLS-1$
			"julian_day", //$NON-NLS-1$
			"lcase", //$NON-NLS-1$
			"lcase", //$NON-NLS-1$
			"left", //$NON-NLS-1$
			"length", //$NON-NLS-1$
			"ln", //$NON-NLS-1$
			"locate", //$NON-NLS-1$
			"log", //$NON-NLS-1$
			"log10", //$NON-NLS-1$
			"long_varchar", //$NON-NLS-1$
			"long_vargraphic", //$NON-NLS-1$
			"ltrim", //$NON-NLS-1$
			"ltrim", //$NON-NLS-1$
			"max", //$NON-NLS-1$
			"microsecond", //$NON-NLS-1$
			"midnight_seconds", //$NON-NLS-1$
			"min", //$NON-NLS-1$
			"minute", //$NON-NLS-1$
			"mod", //$NON-NLS-1$
			"month", //$NON-NLS-1$
			"monthname", //$NON-NLS-1$
			"nodenumber", //$NON-NLS-1$
			"nullif", //$NON-NLS-1$
			"partition", //$NON-NLS-1$
			"posstr", //$NON-NLS-1$
			"power", //$NON-NLS-1$
			"quarter", //$NON-NLS-1$
			"radians", //$NON-NLS-1$
			"raise_error", //$NON-NLS-1$
			"rand", //$NON-NLS-1$
			"real", //$NON-NLS-1$
			"repeat", //$NON-NLS-1$
			"replace", //$NON-NLS-1$
			"right", //$NON-NLS-1$
			"round", //$NON-NLS-1$
			"rtrim", //$NON-NLS-1$
			"rtrim", //$NON-NLS-1$
			"second", //$NON-NLS-1$
			"sign", //$NON-NLS-1$
			"sin", //$NON-NLS-1$
			"smallint", //$NON-NLS-1$
			"soundex", //$NON-NLS-1$
			"space", //$NON-NLS-1$
			"sqlcache_snapshot", //$NON-NLS-1$
			"sqrt", //$NON-NLS-1$
			"stddev", //$NON-NLS-1$
			"substr", //$NON-NLS-1$
			"sum", //$NON-NLS-1$
			"table_name", //$NON-NLS-1$
			"table_schema", //$NON-NLS-1$
			"tan", //$NON-NLS-1$
			"time", //$NON-NLS-1$
			"timestamp", //$NON-NLS-1$
			"timestamp_iso", //$NON-NLS-1$
			"timestampdiff", //$NON-NLS-1$
			"translate", //$NON-NLS-1$
			"truncate", //$NON-NLS-1$
			"trunc", //$NON-NLS-1$
			"type_id", //$NON-NLS-1$
			"type_name", //$NON-NLS-1$
			"type_schema", //$NON-NLS-1$
			"ucase", //$NON-NLS-1$
			"upper", //$NON-NLS-1$
			"value", //$NON-NLS-1$
			"varchar", //$NON-NLS-1$
			"vargraphic", //$NON-NLS-1$
			"variance", //$NON-NLS-1$
			"week", //$NON-NLS-1$
			"week_iso", //$NON-NLS-1$
			"year" //$NON-NLS-1$
	};

}