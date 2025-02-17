/*
 * Copyright (C) 2007-2025 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.cli.options

import picocli.CommandLine

class PreviewTokenOptions {

	@CommandLine.Option(names = ['-s', '--siteIds'], required = true,
		description = 'List of the id of the projects separated by comma')
	String siteIds

	@CommandLine.Option(names = ['-et', '--expires-at'], required = true,
		description = 'The expiration date for the token in the format YYYY-MM-DDTHH:MM:SSZ (UTC)')
	String expiresAt
}
