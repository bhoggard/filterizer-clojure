# filterizer-clojure

Web application for a one-pager art calendar showcasing NYC art events.

## Setup

### Prerequisites

- Java 11 or higher
- Clojure CLI tools
- Node.js and npm (for Tailwind CSS and ClojureScript)

### Installation

1. Install dependencies:
```bash
npm install
```

2. Build Tailwind CSS:
```bash
npm run build:css
```

### Development

1. Watch Tailwind CSS for changes:
```bash
npm run watch:css
```

2. In another terminal, start the Clojure web server:
```bash
clj -M -m filterizer.core
```

3. (Optional) For ClojureScript development with shadow-cljs:
```bash
npx shadow-cljs watch app
```

The application will be available at http://localhost:3000

## Project Structure

- `src/filterizer/` - Clojure source files
  - `core.clj` - Main entry point
  - `handlers.clj` - HTTP request handlers and routing
  - `views/` - Hiccup templates for HTML rendering
- `resources/` - Static resources
  - `css/` - Tailwind CSS source
  - `public/` - Publicly served files
- `deps.edn` - Clojure dependencies
- `shadow-cljs.edn` - ClojureScript build configuration
- `package.json` - Node.js dependencies (Tailwind CSS)
