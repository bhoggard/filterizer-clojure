# Application instructions

This is a Clojure web app. It is for an art calendar with the following objects.

# Data

All fields are required unless marked optional.

Neighborhoo
- name

Venue
- name
- neighborhood (link to neighborhood record)
- address (simple text field)
- website

Event
- name
- venue (link to venue record)
- start date
- end date
- website (optional)

# Architecture

- Use hiccup for HTML. And Tailwind for CSS. Only use ClojureScript for a dropdown with search in the forms for linked objects:
    - A venue's neighborhood
    - An event's venue
- The data will be stored in Supabase.
- All of the admin pages will be in an `/admin` path and protected by Supabase auth.
- The only public page is the home page.
  - This only displays current events. It is organized hierarchically with neighborhoods, then venues, then events.
  - Do not display a neighborhood or venue if there are no current events for them.
  - Use the NYC time zone for everything, so that the homepage will reflect current events for someone in New York.
  - Use this example to build the public page. Match its layout including Tailwind CSS.
