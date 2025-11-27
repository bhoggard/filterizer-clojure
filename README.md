# filterizer-clojure

Web application for a one-pager art calendar showcasing NYC art events.

## Setup

### Prerequisites

- Java 11 or higher
- Clojure CLI tools
- Node.js and Yarn (for Tailwind CSS and ClojureScript)

### Installation

1. Install dependencies:
```bash
yarn install
```

2. Build Tailwind CSS:
```bash
yarn build:css
```

### Development

1. Watch Tailwind CSS for changes:
```bash
yarn watch:css
```

2. In another terminal, start the Clojure web server:
```bash
clj -M -m filterizer.core
```

3. (Optional) For ClojureScript development with shadow-cljs:
```bash
yarn shadow-cljs watch app
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
